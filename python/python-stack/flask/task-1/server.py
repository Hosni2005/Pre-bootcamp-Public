from flask import Flask , render_template

app = Flask(__name__)

@app.route("/")
def home():
    return "Hello World"
@app.route("/hosni")
def champ():
    return "Champion !"
@app.route("/<name>")
def hi(name):
    return f"Hello {name}"
if __name__ == "__main__":
    app.run(debug=True)