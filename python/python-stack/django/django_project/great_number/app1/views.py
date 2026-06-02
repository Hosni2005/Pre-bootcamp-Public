from django.shortcuts import render , redirect
import random 

# Create your views here.

def index(request) :
    if "number" not in request.session:
        request.session["number"] = random.randint(1, 100)
        request.session["attempts"] = 0
        request.session["message"] = ""
        request.session["status"] = ""

    return render(request, "index.html")

def guess(request) :
    if request.method == 'POST' :
        user_guess = int(request.POST["guess"])
        request.session["attempts"] += 1
        number = request.session["number"]

    if user_guess == number:
        request.session["message"] = f"Correct! The number was {number}."
        request.session["status"] = "correct"

    elif request.session["attempts"] >= 5:
        request.session["message"] = f"You Lose! The number was {number}."
        request.session["status"] = "lose"

    elif user_guess > number:
        request.session["message"] = "Too High!"
        request.session["status"] = "high"

    else:
            request.session["message"] = "Too Low!"
            request.session["status"] = "low"
    return redirect("/")
def save_winner(request):
    if request.method == "POST":
        name = request.POST["name"]

        leaderboard = request.session.get("leaderboard", [])

        leaderboard.append({
            "name": name,
            "attempts": request.session["attempts"]
        })

        request.session["leaderboard"] = leaderboard

    return redirect("/leaderboard")
def leaderboard(request):
    winners = request.session.get("leaderboard", [])
    return render(request, "leaderboard.html", {"winners": winners})


def reset(request):
    leaderboard = request.session.get("leaderboard", [])
    request.session.flush()
    request.session["leaderboard"] = leaderboard

    return redirect("/")