from models.dbconexion import Database
from models.model_lenguaje import Lenguaje


class LenguajeController:

    def __init__(self):        
        self.SQLC = "INSERT INTO lenguaje (nombre, tipo) VALUES (%s, %s)"
        self.SQLR = "SELECT * FROM lenguaje"
        self.SQLU = "UPDATE lenguaje SET nombre=%s, tipo=%s WHERE idlenguaje = %s"        
        self.SQLD = "DELETE FROM lenguaje WHERE idlenguaje = %s"

    def create(self, objeto:Lenguaje):
        db = Database()
        conn = db.conexion()
        try:
            with conn.cursor() as cursor:
                res = cursor.execute(self.SQLC, (objeto.nombre, objeto.tipo))
                conn.commit()
            if res == 1:
                return "Transacción exitosa"
            else:
                return "Error"
        finally:
            conn.close()

    def findAll(self):
        db = Database()
        conn = db.conexion()
        lenguajes = []
        try:
            with conn.cursor() as cursor:
                cursor.execute(self.SQLR)
                dict_res = cursor.fetchall()
            for t in dict_res:
                lenguajes.append(t)

        finally:
            conn.close()
        return lenguajes

    def update(self, objeto:Lenguaje):
        db = Database()
        conn = db.conexion()
        try:
            with conn.cursor() as cursor:
                res = cursor.execute(self.SQLU, (objeto.nombre, objeto.tipo, objeto.idlenguaje))
                conn.commit()
            if res == 1:
                return "Transacción exitosa"
            else:
                return "Error"
        finally:
            conn.close()

    def delete(self, objeto:Lenguaje):
        db = Database()
        conn = db.conexion()
        try:
            with conn.cursor() as cursor:
                res = cursor.execute(self.SQLD, (objeto.idlenguaje))
                conn.commit()
            if res == 1:
                return "Transacción exitosa"
            else:
                return "Error"
        finally:
            conn.close()