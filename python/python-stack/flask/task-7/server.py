from flask import Flask, render_template, session, redirect, request

app = Flask(__name__)
app.secret_key = "counter_secret_key"


@app.route("/")
def index():
    if "visits" in session:
        session["visits"] += 1
    else:
        session["visits"] = 1

    if "counter" not in session:
        session["counter"] = 0

    return render_template(
        "index.html",
        visits=session["visits"],
        counter=session["counter"]
    )


@app.route("/add_two")
def add_two():
    session["counter"] += 2
    return redirect("/")


@app.route("/increment", methods=["POST"])
def increment():
    amount = int(request.form["amount"])
    session["counter"] += amount
    return redirect("/")


@app.route("/reset")
def reset():
    session["counter"] = 0
    return redirect("/")


@app.route("/destroy_session")
def destroy_session():
    session.clear()
    return redirect("/")

if __name__ == "__main__":
    app.run(debug=True)