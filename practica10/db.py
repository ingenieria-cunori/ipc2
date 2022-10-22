import pymysql


class Database:
    def __init__(self):
        self.host = "localhost"
        self.user = "cunori"
        self.password = "cunori"
        self.db = "flask"
    
    def consulta(self):
        conn = pymysql.connect(host=self.host, user=self.user,
                       password=self.password, db=self.db, cursorclass=pymysql.cursors.DictCursor)
        lista = []
        try:
            with conn.cursor() as cursor:
                sql = "SELECT * FROM lenguaje"
                cursor.execute(sql)
                dict_res = cursor.fetchall()

            for t in dict_res:
                lista.append(t["nombre"])
       
        finally:
            conn.close()
        
        return lista