from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return "Hello Hosni"
@app.route("/axsos")
def company():
    return "Hello Axsos"
@app.route("/student")
def student():
    return "Hello Ramez"
if __name__ == "__main__":
    app.run(debug=True)