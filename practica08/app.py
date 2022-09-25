from flask import Flask, url_for
from markupsafe import escape

app = Flask(__name__)

@app.route("/inicio")
def hello_world():
    return "<p>Hello, World!</p>"

#ESCAPE HTML
'''
Al devolver HTML (el tipo de respuesta predeterminado en Flask), 
todos los valores proporcionados por el usuario representados en la 
salida deben escaparse para protegerse de los ataques de inyección.
'''
@app.route("/<name>")
def saludo(name):
    return f"Hola: {escape(name)}!"

#ENRUTAMIENTO
@app.route('/')
def index():
    return 'Index Page'

@app.route('/hello')
def hello():
    return 'Hello, World'


#REGLAS VARIABLES
@app.route('/user/<username>')
def show_user_profile(username):
    # show the user profile for that user
    return f'User {escape(username)}'

@app.route('/post/<int:post_id>')
def show_post(post_id):
    # show the post with the given id, the id is an integer
    return f'Post {post_id}'

@app.route('/path/<path:subpath>')
def show_subpath(subpath):
    # show the subpath after /path/
    return f'Subpath {escape(subpath)}'


'''
Tipos de convertidores:
string  ->      (predeterminado) acepta cualquier texto sin barra inclinada
int     ->      acepta enteros positivos
float   ->      acepta valores de coma flotante positivos
path    ->      Me gusta stringpero también acepta barras
uuid    ->      acepta cadenas UUID
'''

#URL's ÚNICAS
@app.route('/projects/')
def projects():
    return 'The project page'

@app.route('/about')
def about():
    return 'The about page'


#CREACIÓN DE URL's
'''
Para crear una URL para una función específica, use la url_for()función.
'''
@app.route('/home')
def home():
    return 'home'

@app.route('/login')
def login():
    return 'login'

@app.route('/user/<username>')
def profile(username):
    return f'{username}\'s profile'

with app.test_request_context():
    print(url_for('home'))
    print(url_for('login'))
    print(url_for('login', next='/home'))
    print(url_for('profile', username='John Doe'))
