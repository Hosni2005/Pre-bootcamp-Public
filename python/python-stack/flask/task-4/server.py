from flask import Flask , render_template
app = Flask(__name__)

@app.route('/')
def index(x=8, y=8):
    return render_template('index.html', x=int(x), y=int(y) , color1='white', color2='black')
@app.route('/<x>')
def index1(x, y=8):
    return render_template('index.html', x=int(x), y=int(y) , color1='white', color2='black')
@app.route('/<x>/<y>')
def index2(x, y):
    return render_template('index.html', x=int(x), y=int(y) , color1='white', color2='black')
@app.route('/<x>/<y>/<color1>')
def index4(x, y, color1, color2="black"):
    return render_template('index.html', x=int(x), y=int(y) , color1=color1, color2=color2)
@app.route('/<x>/<y>/<color1>/<color2>')
def index3(x=8,y=8,color1="white",color2="black"):
    return render_template("index.html", x=int(x) , y=int(y) ,color1 = color1,color2 = color2)
if __name__=="__main__":
    app.run(debug=True)