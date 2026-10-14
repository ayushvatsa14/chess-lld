package entity;

import factory.PieceFactory;

public class Board{
    private final Piece[][] board;

    public Board(){
        board=new Piece[8][8];
        initializePieces();
    }

    private void initializePieces() {
        board[0][0] = PieceFactory.createPiece(PieceType.ROOK, Color.BLACK);
        board[0][1] = PieceFactory.createPiece(PieceType.KNIGHT, Color.BLACK);
        board[0][2] = PieceFactory.createPiece(PieceType.BISHOP, Color.BLACK);
        board[0][3] = PieceFactory.createPiece(PieceType.QUEEN, Color.BLACK);
        board[0][4] = PieceFactory.createPiece(PieceType.KING, Color.BLACK);
        board[0][5] = PieceFactory.createPiece(PieceType.BISHOP, Color.BLACK);
        board[0][6] = PieceFactory.createPiece(PieceType.KNIGHT, Color.BLACK);
        board[0][7] = PieceFactory.createPiece(PieceType.ROOK, Color.BLACK);

        for(int col=0; col<8; col++) {
            board[1][col]=PieceFactory.createPiece(PieceType.PAWN, Color.BLACK);
        }

        board[7][0] = PieceFactory.createPiece(PieceType.ROOK, Color.WHITE);
        board[7][1] = PieceFactory.createPiece(PieceType.KNIGHT, Color.WHITE);
        board[7][2] = PieceFactory.createPiece(PieceType.BISHOP, Color.WHITE);
        board[7][3] = PieceFactory.createPiece(PieceType.QUEEN, Color.WHITE);
        board[7][4] = PieceFactory.createPiece(PieceType.KING, Color.WHITE);
        board[7][5] = PieceFactory.createPiece(PieceType.BISHOP, Color.WHITE);
        board[7][6] = PieceFactory.createPiece(PieceType.KNIGHT, Color.WHITE);
        board[7][7] = PieceFactory.createPiece(PieceType.ROOK, Color.WHITE);

        for (int col=0; col<8; col++) {
            board[6][col]=PieceFactory.createPiece(PieceType.PAWN, Color.WHITE);
        }
    }

    public Piece getPieceAtPosition(int row, int col){
        return board[row][col];
    }

    public void setPieceAtPosition(Piece piece, int row, int col){
        board[row][col]=piece;
    }

    public int getBoardSize(){
        return board.length;
    }
}