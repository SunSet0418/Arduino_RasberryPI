from flask import Flask , jsonify
import main, time
 
app = Flask(__name__)
@app.route('/data', methods=['POST'])
def index():
    now = time.localtime()
    getdata = main.data().strip("'b")
    print(getdata)
    string = getdata.strip('\\r\\n')
    split = string.split(' ')
    s = "%04d %02d %02d  %02d:%02d:%02d" % (now.tm_year, now.tm_mon, now.tm_mday, now.tm_hour, now.tm_min, now.tm_sec)
    returndata = {'Temperature' : split[0], 'Humidity' : split[1], 'Time' : s, 'Sound' : split[2]}
    print(returndata)
    return jsonify(returndata)
if __name__ == '__main__':
    app.run('0.0.0.0', '10000')