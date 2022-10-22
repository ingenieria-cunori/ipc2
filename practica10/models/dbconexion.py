import pymysql


class Database:
    def __init__(self):
        self.PORT_DB_SERVER = 3306
        self.HOST_DB_SERVER = "localhost"
        self.USER_DB_SERVER = "cunori"
        self.PASSWORD_DB_SERVER = "cunori"
        self.DB_NAME = "flask"

    def conexion(self):
        conn = pymysql.connect(host=self.HOST_DB_SERVER, port=self.PORT_DB_SERVER,
                               user=self.USER_DB_SERVER, password=self.PASSWORD_DB_SERVER,
                               db=self.DB_NAME, cursorclass=pymysql.cursors.DictCursor)
        return conn
