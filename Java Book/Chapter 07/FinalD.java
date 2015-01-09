// Return a String object.
class ErrorMsg {
    // Error codes
    final int OUT_ERR = 0;
    final int IN_ERR = 1;
    final int DISK_ERR = 2;
    final int INDEX_ERR = 3;

    String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-of-Bounds"
    };

    // Return the error message.
    String getErrorMsg(int i) {
        if(i >= 0 && i < msgs.length) {
            return msgs[i];
        }
        else {
            return "Invalid Error Code";
        }
    }
}

class FinalD {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUT_ERR));
        System.out.println(err.getErrorMsg(err.DISK_ERR));
    }
}
