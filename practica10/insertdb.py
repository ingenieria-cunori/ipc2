import pymysql

host = "localhost"
user = "cunori"
password = "cunori"
db = "flask"

conn = pymysql.connect(host=host, user=user,
                       password=password, db=db, cursorclass=pymysql.cursors.DictCursor)

try:
    with conn.cursor() as cursor:
        sql = "INSERT INTO lenguaje (nombre,tipo) VALUES (%s, %s)"
        res = cursor.execute(sql, ("PHP", "Interpretado"))
        conn.commit()
        if res == 1:
            print("Transacción exitosa")
        else:
            print("Error")
finally:
    conn.close()