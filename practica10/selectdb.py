from typing import Coroutine
import pymysql

host = "localhost"
user = "cunori"
password = "cunori"
db = "flask"

conn = pymysql.connect(host=host, user=user,
                       password=password, db=db, cursorclass=pymysql.cursors.DictCursor)

try:
    with conn.cursor() as cursor:
        sql = "SELECT * FROM lenguaje"
        cursor.execute(sql)
        dict_res = cursor.fetchall()

        for t in dict_res:
            print("Id: " + str(t["idlenguaje"]) + ", Lenguaje: " + t["nombre"] + ", Tipo: " + t["tipo"])
       
finally:
    conn.close()
