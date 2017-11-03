from flask import Flask , jsonify
import main

app = Flask(__name__)

@app.route('/data', methods=['POST'])
def index():
    getdata = main.data().strip("'b")
    print(getdata)
    string = getdata.strip('\\r\\n')
    split = string.split(' ')
    returndata = {'Temperuture' : split[0], 'Humidity' : split[1]}
    print(returndata)
    return jsonify(returndata)

if __name__ == '__main__':
    app.run('0.0.0.0', '3000')