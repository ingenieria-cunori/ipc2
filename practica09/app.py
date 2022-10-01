from flask import Flask, render_template, request

app = Flask(__name__)

@app.route("/")
def hello_world():
    return render_template("index.html", mensaje="Hola !")

@app.route("/about")
def acercade():
    return render_template("about.html",mensaje="JINJA + Bootstrap 5")

@app.route("/lenguajes")
def lenguajes():
    lenguajes = ["C", "C++", "PASCAL", "JAVA", "Python", "Go" ]
    return render_template("lenguajes.html", lista = lenguajes)


@app.route("/formulario")
def formulario():
    return render_template("formulario.html")

@app.route("/recibir", methods=["GET", "POST"])
def recibir():
    if request.method == "GET":
        return "Por favor use el formulario"
    
    codigo = request.form.get("codigo")
    nombre = request.form.get("nombre")
    
    if codigo == None or codigo == "":
        return "Complete el formulario"
    
    return render_template("recibir.html", codigo=codigo, nombre = nombre)