#Chess_game_JAVA#

Tabuleiro --> matriz de pieces, ou iniciar o jogo fazemos upcasting de chesspieces p/ pieces

Peças --> Objetos contendo tabuleiro, posição (Pieces), contador de movimentos, cor - ENUM - (ChessPieces - subclasse de pieces) e nome(peças específicas) que é o representado por uma letra no método toString

Posição:
         Position --> poisição de tabuleiro(matriz)
         
         ChessPosition --> posição de xadrez como eh mostrada na tela(Ex:h8)

Lógica de movimento --> respeita a regra para cada peça; uma matriz de booleans mostrando as posições para qual aquela peça pode se mover

Captura de peças --> remove-se a peça capturada e a peça que a capturou ocupará então sua posição


