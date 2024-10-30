package vttp.batch5.sdf.task02;

public class TicTacToe {

    private String inputFile;
    private char[][] board = null;
    private char currentPlayer;
    
    public TicTacToe(String ttt) {
        inputFile = ttt;

    public TicTacToe(char [][] b){
        board = b;
        height = b.length;
        width = b[0].length;
    }

    public void readFile() throws Exception {

        Reader reader = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(reader);
        String line;
  
        while ((line = br.readLine()) != null) {
           line = line.trim();
        }

        String terms[] = line.split(" ");
        if (Constants.GRID.equals(terms[0])) {
           width = Integer.parseInt(terms[1]);
           height = Integer.parseInt(terms[2]);
           board = new char[height][0];

   
    
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

}
