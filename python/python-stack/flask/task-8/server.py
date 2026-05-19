from flask import Flask, render_template, request, redirect, session
import random

app = Flask(__name__)
app.secret_key = "great_number_game_secret"


@app.route("/")
def index():
    if "number" not in session:
        session["number"] = random.randint(1, 100)
        session["attempts"] = 0
        session["message"] = ""
        session["status"] = ""

    return render_template("index.html")


@app.route("/guess", methods=["POST"])
def guess():
    user_guess = int(request.form["guess"])
    session["attempts"] += 1

    if user_guess == session["number"]:
        session["message"] = f"Correct! The number was {session['number']}."
        session["status"] = "correct"

    elif session["attempts"] >= 5:
        session["message"] = f"You Lose! The number was {session['number']}."
        session["status"] = "lose"

    elif user_guess > session["number"]:
        session["message"] = "Too High!"
        session["status"] = "high"

    else:
        session["message"] = "Too Low!"
        session["status"] = "low"

    return redirect("/")


@app.route("/save_winner", methods=["POST"])
def save_winner():
    name = request.form["name"]

    if "leaderboard" not in session:
        session["leaderboard"] = []

    leaderboard = session["leaderboard"]
    leaderboard.append({
        "name": name,
        "attempts": session["attempts"]
    })

    session["leaderboard"] = leaderboard

    return redirect("/leaderboard")


@app.route("/leaderboard")
def leaderboard():
    winners = session.get("leaderboard", [])
    return render_template("leaderboard.html", winners=winners)


@app.route("/reset")
def reset():
    leaderboard = session.get("leaderboard", [])
    session.clear()
    session["leaderboard"] = leaderboard
    return redirect("/")


if __name__ == "__main__":
    app.run(debug=True)