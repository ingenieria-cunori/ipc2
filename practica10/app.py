from flask import Flask, render_template
from models.controller_lenguaje import LenguajeController
from models.model_lenguaje import Lenguaje

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("index.html")


@app.route("/create")
def create():
    tran = LenguajeController()
    lenguaje = Lenguaje()
    lenguaje.nombre = "Pascal"
    lenguaje.tipo = "Interpretado"
    tran.create(lenguaje)
    return render_template("index.html")


@app.route("/findAll")
def findAll():
    tran = LenguajeController()    
    print(tran.findAll())
    return render_template("index.html")


@app.route("/update")
def update():
    tran = LenguajeController()
    lenguaje = Lenguaje()
    lenguaje.idlenguaje = 5
    lenguaje.nombre = "Python"
    lenguaje.tipo = "Interpretado"
    tran.update(lenguaje)
    return render_template("index.html")


@app.route("/delete")
def delete():
    tran = LenguajeController()
    lenguaje = Lenguaje()
    lenguaje.idlenguaje = 7
    tran.delete(lenguaje)
    return render_template("index.html")