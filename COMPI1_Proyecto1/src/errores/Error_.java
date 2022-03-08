package errores;

public class Error_ {
    private String message;
    private int col;
    private int row;
    private String type;

    public Error_(String message, String type, int col, int row) {
            this.message = message;
            this.col = col;
            this.row = row;
            this.type = type;
            
    }

    public String getMessage() {
            return message;
    }

    public void setMessage(String message) {
            this.message = message;
    }

    public String getType() {
            return type;
    }

    public void setType(String type) {
            this.type = type;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    
}
