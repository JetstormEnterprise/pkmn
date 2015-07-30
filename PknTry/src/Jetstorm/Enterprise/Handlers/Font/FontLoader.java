package Jetstorm.Enterprise.Handlers.Font;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class FontLoader {

	public static BufferedImage[] darkText;
	public static BufferedImage[] lightText;
	public static BufferedImage[] battleText;
	public static BufferedImage[] pokemonSelectText;
	public static BufferedImage[] blueText;
	public static BufferedImage[] redText;

	public static void init() {

		darkText = new BufferedImage[72]; // width = 6, height = 11
		lightText = new BufferedImage[72];
		battleText = new BufferedImage[76];
		pokemonSelectText = new BufferedImage[72];
		blueText = new BufferedImage[72];
		redText = new BufferedImage[72];

		try {

			BufferedImage temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/frlg0.gif"));

			darkText[0] = temp.getSubimage(7, 0, 6, 12); // !
			darkText[1] = temp.getSubimage(72, 0, 6, 12); // ,
			darkText[2] = temp.getSubimage(78, 0, 6, 12); // -
			darkText[3] = temp.getSubimage(84, 0, 6, 12); // .
			darkText[4] = temp.getSubimage(90, 0, 6, 12); // /
			darkText[5] = temp.getSubimage(96, 0, 6, 12); // 0
			darkText[6] = temp.getSubimage(102, 0, 6, 12); // 1
			darkText[7] = temp.getSubimage(108, 0, 6, 12); // 2
			darkText[8] = temp.getSubimage(114, 0, 6, 12); // 3

			darkText[9] = temp.getSubimage(0, 12, 6, 12); // 4
			darkText[10] = temp.getSubimage(6, 12, 6, 12); // 5
			darkText[11] = temp.getSubimage(12, 12, 6, 12); // 6
			darkText[12] = temp.getSubimage(18, 12, 6, 12); // 7
			darkText[13] = temp.getSubimage(24, 12, 6, 12); // 8
			darkText[14] = temp.getSubimage(30, 12, 6, 12); // 9
			darkText[15] = temp.getSubimage(66, 12, 6, 12); // ?
			darkText[16] = temp.getSubimage(78, 12, 6, 12); // A
			darkText[17] = temp.getSubimage(84, 12, 6, 12); // B
			darkText[18] = temp.getSubimage(90, 12, 6, 12); // C
			darkText[19] = temp.getSubimage(96, 12, 6, 12); // D
			darkText[20] = temp.getSubimage(102, 12, 6, 12); // E
			darkText[21] = temp.getSubimage(108, 12, 6, 12); // F
			darkText[22] = temp.getSubimage(114, 12, 6, 12); // G

			darkText[23] = temp.getSubimage(0, 24, 6, 12); // H
			darkText[24] = temp.getSubimage(6, 24, 6, 12); // I
			darkText[25] = temp.getSubimage(12, 24, 6, 12); // J
			darkText[26] = temp.getSubimage(18, 24, 6, 12); // K
			darkText[27] = temp.getSubimage(24, 24, 6, 12); // L
			darkText[28] = temp.getSubimage(30, 24, 6, 12); // M
			darkText[29] = temp.getSubimage(36, 24, 6, 12); // N
			darkText[30] = temp.getSubimage(42, 24, 6, 12); // O
			darkText[31] = temp.getSubimage(48, 24, 6, 12); // P
			darkText[32] = temp.getSubimage(54, 24, 6, 12); // Q
			darkText[33] = temp.getSubimage(60, 24, 6, 12); // R
			darkText[34] = temp.getSubimage(66, 24, 6, 12); // S
			darkText[35] = temp.getSubimage(72, 24, 6, 12); // T
			darkText[36] = temp.getSubimage(78, 24, 6, 12); // U
			darkText[37] = temp.getSubimage(84, 24, 6, 12); // V
			darkText[38] = temp.getSubimage(90, 24, 6, 12); // W
			darkText[39] = temp.getSubimage(96, 24, 6, 12); // X
			darkText[40] = temp.getSubimage(102, 24, 6, 12); // Y
			darkText[41] = temp.getSubimage(108, 24, 6, 12); // Z
			darkText[42] = temp.getSubimage(114, 24, 6, 12); // Male

			darkText[43] = temp.getSubimage(6, 36, 6, 12); // Female
			darkText[44] = temp.getSubimage(18, 36, 6, 12); // ...
			darkText[45] = temp.getSubimage(30, 36, 6, 12); // a
			darkText[46] = temp.getSubimage(36, 36, 6, 12); // b
			darkText[47] = temp.getSubimage(42, 36, 6, 12); // c
			darkText[48] = temp.getSubimage(48, 36, 6, 12); // d
			darkText[49] = temp.getSubimage(54, 36, 6, 12); // e
			darkText[50] = temp.getSubimage(60, 36, 6, 12); // f
			darkText[51] = temp.getSubimage(66, 36, 6, 12); // g
			darkText[52] = temp.getSubimage(72, 36, 6, 12); // h
			darkText[53] = temp.getSubimage(78, 36, 6, 12); // i
			darkText[54] = temp.getSubimage(84, 36, 6, 12); // j
			darkText[55] = temp.getSubimage(90, 36, 6, 12); // k
			darkText[56] = temp.getSubimage(96, 36, 6, 12); // l
			darkText[57] = temp.getSubimage(102, 36, 6, 12); // m
			darkText[58] = temp.getSubimage(108, 36, 6, 12); // n
			darkText[59] = temp.getSubimage(114, 36, 6, 12); // o

			darkText[60] = temp.getSubimage(0, 48, 6, 12); // p
			darkText[61] = temp.getSubimage(6, 48, 6, 12); // q
			darkText[62] = temp.getSubimage(12, 48, 6, 12); // r
			darkText[63] = temp.getSubimage(18, 48, 6, 12); // s
			darkText[64] = temp.getSubimage(24, 48, 6, 12); // t
			darkText[65] = temp.getSubimage(30, 48, 6, 12); // u
			darkText[66] = temp.getSubimage(36, 48, 6, 12); // v
			darkText[67] = temp.getSubimage(42, 48, 6, 12); // w
			darkText[68] = temp.getSubimage(48, 48, 6, 12); // x
			darkText[69] = temp.getSubimage(54, 48, 6, 12); // y
			darkText[70] = temp.getSubimage(60, 48, 6, 12); // z
			darkText[71] = temp.getSubimage(24, 0, 6, 12); // " "

			temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/frlg1.gif"));

			lightText[0] = temp.getSubimage(7, 0, 6, 12); // !
			lightText[1] = temp.getSubimage(72, 0, 6, 12); // ,
			lightText[2] = temp.getSubimage(78, 0, 6, 12); // -
			lightText[3] = temp.getSubimage(84, 0, 6, 12); // .
			lightText[4] = temp.getSubimage(90, 0, 6, 12); // /
			lightText[5] = temp.getSubimage(96, 0, 6, 12); // 0
			lightText[6] = temp.getSubimage(102, 0, 6, 12); // 1
			lightText[7] = temp.getSubimage(108, 0, 6, 12); // 2
			lightText[8] = temp.getSubimage(114, 0, 6, 12); // 3

			lightText[9] = temp.getSubimage(0, 12, 6, 12); // 4
			lightText[10] = temp.getSubimage(6, 12, 6, 12); // 5
			lightText[11] = temp.getSubimage(12, 12, 6, 12); // 6
			lightText[12] = temp.getSubimage(18, 12, 6, 12); // 7
			lightText[13] = temp.getSubimage(24, 12, 6, 12); // 8
			lightText[14] = temp.getSubimage(30, 12, 6, 12); // 9
			lightText[15] = temp.getSubimage(66, 12, 6, 12); // ?
			lightText[16] = temp.getSubimage(78, 12, 6, 12); // A
			lightText[17] = temp.getSubimage(84, 12, 6, 12); // B
			lightText[18] = temp.getSubimage(90, 12, 6, 12); // C
			lightText[19] = temp.getSubimage(96, 12, 6, 12); // D
			lightText[20] = temp.getSubimage(102, 12, 6, 12); // E
			lightText[21] = temp.getSubimage(108, 12, 6, 12); // F
			lightText[22] = temp.getSubimage(114, 12, 6, 12); // G

			lightText[23] = temp.getSubimage(0, 24, 6, 12); // H
			lightText[24] = temp.getSubimage(6, 24, 6, 12); // I
			lightText[25] = temp.getSubimage(12, 24, 6, 12); // J
			lightText[26] = temp.getSubimage(18, 24, 6, 12); // K
			lightText[27] = temp.getSubimage(24, 24, 6, 12); // L
			lightText[28] = temp.getSubimage(30, 24, 6, 12); // M
			lightText[29] = temp.getSubimage(36, 24, 6, 12); // N
			lightText[30] = temp.getSubimage(42, 24, 6, 12); // O
			lightText[31] = temp.getSubimage(48, 24, 6, 12); // P
			lightText[32] = temp.getSubimage(54, 24, 6, 12); // Q
			lightText[33] = temp.getSubimage(60, 24, 6, 12); // R
			lightText[34] = temp.getSubimage(66, 24, 6, 12); // S
			lightText[35] = temp.getSubimage(72, 24, 6, 12); // T
			lightText[36] = temp.getSubimage(78, 24, 6, 12); // U
			lightText[37] = temp.getSubimage(84, 24, 6, 12); // V
			lightText[38] = temp.getSubimage(90, 24, 6, 12); // W
			lightText[39] = temp.getSubimage(96, 24, 6, 12); // X
			lightText[40] = temp.getSubimage(102, 24, 6, 12); // Y
			lightText[41] = temp.getSubimage(108, 24, 6, 12); // Z
			lightText[42] = temp.getSubimage(114, 24, 6, 12); // Male

			lightText[43] = temp.getSubimage(6, 36, 6, 12); // Female
			lightText[44] = temp.getSubimage(18, 36, 6, 12); // ...
			lightText[45] = temp.getSubimage(30, 36, 6, 12); // a
			lightText[46] = temp.getSubimage(36, 36, 6, 12); // b
			lightText[47] = temp.getSubimage(42, 36, 6, 12); // c
			lightText[48] = temp.getSubimage(48, 36, 6, 12); // d
			lightText[49] = temp.getSubimage(54, 36, 6, 12); // e
			lightText[50] = temp.getSubimage(60, 36, 6, 12); // f
			lightText[51] = temp.getSubimage(66, 36, 6, 12); // g
			lightText[52] = temp.getSubimage(72, 36, 6, 12); // h
			lightText[53] = temp.getSubimage(78, 36, 6, 12); // i
			lightText[54] = temp.getSubimage(84, 36, 6, 12); // j
			lightText[55] = temp.getSubimage(90, 36, 6, 12); // k
			lightText[56] = temp.getSubimage(96, 36, 6, 12); // l
			lightText[57] = temp.getSubimage(102, 36, 6, 12); // m
			lightText[58] = temp.getSubimage(108, 36, 6, 12); // n
			lightText[59] = temp.getSubimage(114, 36, 6, 12); // o

			lightText[60] = temp.getSubimage(0, 48, 6, 12); // p
			lightText[61] = temp.getSubimage(6, 48, 6, 12); // q
			lightText[62] = temp.getSubimage(12, 48, 6, 12); // r
			lightText[63] = temp.getSubimage(18, 48, 6, 12); // s
			lightText[64] = temp.getSubimage(24, 48, 6, 12); // t
			lightText[65] = temp.getSubimage(30, 48, 6, 12); // u
			lightText[66] = temp.getSubimage(36, 48, 6, 12); // v
			lightText[67] = temp.getSubimage(42, 48, 6, 12); // w
			lightText[68] = temp.getSubimage(48, 48, 6, 12); // x
			lightText[69] = temp.getSubimage(54, 48, 6, 12); // y
			lightText[70] = temp.getSubimage(60, 48, 6, 12); // z
			lightText[71] = temp.getSubimage(24, 0, 6, 12); // " "


			temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/battleText.gif"));

			battleText[16] = temp.getSubimage(1, 0, 5, 8); // A
			battleText[17] = temp.getSubimage(8, 0, 5, 8); // B
			battleText[18] = temp.getSubimage(15, 0, 5, 8); // C
			battleText[19] = temp.getSubimage(22, 0, 5, 8); // D
			battleText[20] = temp.getSubimage(29, 0, 5, 8); // E
			battleText[21] = temp.getSubimage(36, 0, 5, 8); // F
			battleText[22] = temp.getSubimage(43, 0, 5, 8); // G
			battleText[23] = temp.getSubimage(50, 0, 5, 8); // H
			battleText[24] = temp.getSubimage(56, 0, 5, 8); // I
			battleText[25] = temp.getSubimage(63, 0, 5, 8); // J
			battleText[26] = temp.getSubimage(70, 0, 5, 8); // K
			battleText[27] = temp.getSubimage(77, 0, 5, 8); // L
			battleText[28] = temp.getSubimage(84, 0, 5, 8); // M
			battleText[29] = temp.getSubimage(91, 0, 5, 8); // N
			battleText[30] = temp.getSubimage(98, 0, 5, 8); // O
			battleText[31] = temp.getSubimage(105, 0, 5, 8); // P
			battleText[32] = temp.getSubimage(112, 0, 5, 8); // Q
			battleText[33] = temp.getSubimage(119, 0, 5, 8); // R
			battleText[34] = temp.getSubimage(126, 0, 5, 8); // S
			battleText[35] = temp.getSubimage(132, 0, 5, 8); // T
			battleText[36] = temp.getSubimage(139, 0, 5, 8); // U
			battleText[37] = temp.getSubimage(146, 0, 5, 8); // V
			battleText[38] = temp.getSubimage(153, 0, 5, 8); // W
			battleText[39] = temp.getSubimage(160, 0, 5, 8); // X
			battleText[40] = temp.getSubimage(166, 0, 5, 8); // Y
			battleText[41] = temp.getSubimage(173, 0, 5, 8); // Z

			battleText[3] = temp.getSubimage(186, 0, 6, 8); // .
			battleText[0] = temp.getSubimage(179, 1, 7, 8); // ,

			for (int i = 45; i < 71; i++) {
				if (i < 53) {
					battleText[i] = temp.getSubimage(0 + ((i - 45) * 7), 19, 7, 8);
				} else if (i == 53) {
					battleText[i] = temp.getSubimage(56, 19, 5, 8);
				} else if (i > 53) {
					battleText[i] = temp.getSubimage(-2 + ((i - 45) * 7), 19, 7, 8);
				}
			}

			battleText[5] = temp.getSubimage(1, 35, 5, 8);
			battleText[6] = temp.getSubimage(9, 35, 4, 8);
			battleText[7] = temp.getSubimage(15, 35, 5, 8);
			battleText[8] = temp.getSubimage(22, 35, 5, 8);
			battleText[9] = temp.getSubimage(29, 35, 5, 8);
			battleText[10] = temp.getSubimage(36, 35, 5, 8);
			battleText[11] = temp.getSubimage(43, 35, 5, 8);
			battleText[12] = temp.getSubimage(50, 35, 5, 8);
			battleText[13] = temp.getSubimage(57, 35, 5, 8);
			battleText[14] = temp.getSubimage(64, 35, 5, 8);

			battleText[0] = temp.getSubimage(0, 52, 7, 8); // !
			battleText[2] = temp.getSubimage(34, 52, 5, 8); // -
			battleText[4] = temp.getSubimage(28, 51, 7, 9); // /
			battleText[15] = temp.getSubimage(7, 52, 7, 8); // ?
			battleText[42] = temp.getSubimage(13, 52, 5, 8); // male
			battleText[43] = temp.getSubimage(20, 52, 5, 8); // female
			battleText[44] = temp.getSubimage(42, 52, 7, 8); // ..

			temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/pokemonselecttext.gif"));

			pokemonSelectText[16] = temp.getSubimage(0, 0, 5, 8); // A
			pokemonSelectText[17] = temp.getSubimage(7, 0, 5, 8); // B
			pokemonSelectText[18] = temp.getSubimage(14, 0, 5, 8); // C
			pokemonSelectText[19] = temp.getSubimage(21, 0, 5, 8); // D
			pokemonSelectText[20] = temp.getSubimage(28, 0, 5, 8); // E
			pokemonSelectText[21] = temp.getSubimage(35, 0, 5, 8); // F
			pokemonSelectText[22] = temp.getSubimage(42, 0, 5, 8); // G
			pokemonSelectText[23] = temp.getSubimage(49, 0, 5, 8); // H
			pokemonSelectText[24] = temp.getSubimage(56, 0, 4, 8); // I
			pokemonSelectText[25] = temp.getSubimage(63, 0, 5, 8); // J
			pokemonSelectText[26] = temp.getSubimage(70, 0, 5, 8); // K
			pokemonSelectText[27] = temp.getSubimage(77, 0, 5, 8); // L
			pokemonSelectText[28] = temp.getSubimage(84, 0, 5, 8); // M
			pokemonSelectText[29] = temp.getSubimage(0, 10, 5, 8); // N
			pokemonSelectText[30] = temp.getSubimage(7, 10, 5, 8); // O
			pokemonSelectText[31] = temp.getSubimage(14, 10, 5, 8); // P
			pokemonSelectText[32] = temp.getSubimage(21, 10, 5, 8); // Q
			pokemonSelectText[33] = temp.getSubimage(28, 10, 5, 8); // R
			pokemonSelectText[34] = temp.getSubimage(35, 10, 5, 8); // S
			pokemonSelectText[35] = temp.getSubimage(42, 10, 5, 8); // T
			pokemonSelectText[36] = temp.getSubimage(49, 10, 5, 8); // U
			pokemonSelectText[37] = temp.getSubimage(56, 10, 5, 8); // V
			pokemonSelectText[38] = temp.getSubimage(63, 10, 5, 8); // W
			pokemonSelectText[39] = temp.getSubimage(70, 10, 5, 8); // X
			pokemonSelectText[40] = temp.getSubimage(77, 10, 5, 8); // Y
			pokemonSelectText[41] = temp.getSubimage(84, 10, 5, 8); // Z

			pokemonSelectText[5] = temp.getSubimage(123, 10, 5, 8); // 0
			pokemonSelectText[6] = temp.getSubimage(95, 0, 4, 8); // 1
			pokemonSelectText[7] = temp.getSubimage(102, 0, 5, 8); // 2
			pokemonSelectText[8] = temp.getSubimage(109, 0, 5, 8); // 3
			pokemonSelectText[9] = temp.getSubimage(116, 0, 5, 8); // 4
			pokemonSelectText[10] = temp.getSubimage(123, 0, 5, 8); // 5
			pokemonSelectText[11] = temp.getSubimage(95, 10, 5, 8); // 6
			pokemonSelectText[12] = temp.getSubimage(102, 10, 5, 8); // 7
			pokemonSelectText[13] = temp.getSubimage(109, 10, 5, 8); // 8
			pokemonSelectText[14] = temp.getSubimage(116, 10, 5, 8); // 9

			pokemonSelectText[42] = temp.getSubimage(135, 0, 5, 8); // male
			pokemonSelectText[43] = temp.getSubimage(135, 10, 5, 8); // female

			temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/frlgblue.gif"));

			blueText[0] = temp.getSubimage(7, 0, 6, 12); // !
			blueText[1] = temp.getSubimage(72, 0, 6, 12); // ,
			blueText[2] = temp.getSubimage(78, 0, 6, 12); // -
			blueText[3] = temp.getSubimage(84, 0, 6, 12); // .
			blueText[4] = temp.getSubimage(90, 0, 6, 12); // /
			blueText[5] = temp.getSubimage(96, 0, 6, 12); // 0
			blueText[6] = temp.getSubimage(102, 0, 6, 12); // 1
			blueText[7] = temp.getSubimage(108, 0, 6, 12); // 2
			blueText[8] = temp.getSubimage(114, 0, 6, 12); // 3

			blueText[9] = temp.getSubimage(0, 12, 6, 12); // 4
			blueText[10] = temp.getSubimage(6, 12, 6, 12); // 5
			blueText[11] = temp.getSubimage(12, 12, 6, 12); // 6
			blueText[12] = temp.getSubimage(18, 12, 6, 12); // 7
			blueText[13] = temp.getSubimage(24, 12, 6, 12); // 8
			blueText[14] = temp.getSubimage(30, 12, 6, 12); // 9
			blueText[15] = temp.getSubimage(66, 12, 6, 12); // ?
			blueText[16] = temp.getSubimage(78, 12, 6, 12); // A
			blueText[17] = temp.getSubimage(84, 12, 6, 12); // B
			blueText[18] = temp.getSubimage(90, 12, 6, 12); // C
			blueText[19] = temp.getSubimage(96, 12, 6, 12); // D
			blueText[20] = temp.getSubimage(102, 12, 6, 12); // E
			blueText[21] = temp.getSubimage(108, 12, 6, 12); // F
			blueText[22] = temp.getSubimage(114, 12, 6, 12); // G

			blueText[23] = temp.getSubimage(0, 24, 6, 12); // H
			blueText[24] = temp.getSubimage(6, 24, 6, 12); // I
			blueText[25] = temp.getSubimage(12, 24, 6, 12); // J
			blueText[26] = temp.getSubimage(18, 24, 6, 12); // K
			blueText[27] = temp.getSubimage(24, 24, 6, 12); // L
			blueText[28] = temp.getSubimage(30, 24, 6, 12); // M
			blueText[29] = temp.getSubimage(36, 24, 6, 12); // N
			blueText[30] = temp.getSubimage(42, 24, 6, 12); // O
			blueText[31] = temp.getSubimage(48, 24, 6, 12); // P
			blueText[32] = temp.getSubimage(54, 24, 6, 12); // Q
			blueText[33] = temp.getSubimage(60, 24, 6, 12); // R
			blueText[34] = temp.getSubimage(66, 24, 6, 12); // S
			blueText[35] = temp.getSubimage(72, 24, 6, 12); // T
			blueText[36] = temp.getSubimage(78, 24, 6, 12); // U
			blueText[37] = temp.getSubimage(84, 24, 6, 12); // V
			blueText[38] = temp.getSubimage(90, 24, 6, 12); // W
			blueText[39] = temp.getSubimage(96, 24, 6, 12); // X
			blueText[40] = temp.getSubimage(102, 24, 6, 12); // Y
			blueText[41] = temp.getSubimage(108, 24, 6, 12); // Z
			blueText[42] = temp.getSubimage(114, 24, 6, 12); // Male

			blueText[43] = temp.getSubimage(6, 36, 6, 12); // Female
			blueText[44] = temp.getSubimage(18, 36, 6, 12); // ...
			blueText[45] = temp.getSubimage(30, 36, 6, 12); // a
			blueText[46] = temp.getSubimage(36, 36, 6, 12); // b
			blueText[47] = temp.getSubimage(42, 36, 6, 12); // c
			blueText[48] = temp.getSubimage(48, 36, 6, 12); // d
			blueText[49] = temp.getSubimage(54, 36, 6, 12); // e
			blueText[50] = temp.getSubimage(60, 36, 6, 12); // f
			blueText[51] = temp.getSubimage(66, 36, 6, 12); // g
			blueText[52] = temp.getSubimage(72, 36, 6, 12); // h
			blueText[53] = temp.getSubimage(78, 36, 6, 12); // i
			blueText[54] = temp.getSubimage(84, 36, 6, 12); // j
			blueText[55] = temp.getSubimage(90, 36, 6, 12); // k
			blueText[56] = temp.getSubimage(96, 36, 6, 12); // l
			blueText[57] = temp.getSubimage(102, 36, 6, 12); // m
			blueText[58] = temp.getSubimage(108, 36, 6, 12); // n
			blueText[59] = temp.getSubimage(114, 36, 6, 12); // o

			blueText[60] = temp.getSubimage(0, 48, 6, 12); // p
			blueText[61] = temp.getSubimage(6, 48, 6, 12); // q
			blueText[62] = temp.getSubimage(12, 48, 6, 12); // r
			blueText[63] = temp.getSubimage(18, 48, 6, 12); // s
			blueText[64] = temp.getSubimage(24, 48, 6, 12); // t
			blueText[65] = temp.getSubimage(30, 48, 6, 12); // u
			blueText[66] = temp.getSubimage(36, 48, 6, 12); // v
			blueText[67] = temp.getSubimage(42, 48, 6, 12); // w
			blueText[68] = temp.getSubimage(48, 48, 6, 12); // x
			blueText[69] = temp.getSubimage(54, 48, 6, 12); // y
			blueText[70] = temp.getSubimage(60, 48, 6, 12); // z
			blueText[71] = temp.getSubimage(24, 0, 6, 12); // " "

			temp = ImageIO.read(FontLoader.class.getResourceAsStream("/entities/frlgred.gif"));

			redText[0] = temp.getSubimage(7, 0, 6, 12); // !
			redText[1] = temp.getSubimage(72, 0, 6, 12); // ,
			redText[2] = temp.getSubimage(78, 0, 6, 12); // -
			redText[3] = temp.getSubimage(84, 0, 6, 12); // .
			redText[4] = temp.getSubimage(90, 0, 6, 12); // /
			redText[5] = temp.getSubimage(96, 0, 6, 12); // 0
			redText[6] = temp.getSubimage(102, 0, 6, 12); // 1
			redText[7] = temp.getSubimage(108, 0, 6, 12); // 2
			redText[8] = temp.getSubimage(114, 0, 6, 12); // 3

			redText[9] = temp.getSubimage(0, 12, 6, 12); // 4
			redText[10] = temp.getSubimage(6, 12, 6, 12); // 5
			redText[11] = temp.getSubimage(12, 12, 6, 12); // 6
			redText[12] = temp.getSubimage(18, 12, 6, 12); // 7
			redText[13] = temp.getSubimage(24, 12, 6, 12); // 8
			redText[14] = temp.getSubimage(30, 12, 6, 12); // 9
			redText[15] = temp.getSubimage(66, 12, 6, 12); // ?
			redText[16] = temp.getSubimage(78, 12, 6, 12); // A
			redText[17] = temp.getSubimage(84, 12, 6, 12); // B
			redText[18] = temp.getSubimage(90, 12, 6, 12); // C
			redText[19] = temp.getSubimage(96, 12, 6, 12); // D
			redText[20] = temp.getSubimage(102, 12, 6, 12); // E
			redText[21] = temp.getSubimage(108, 12, 6, 12); // F
			redText[22] = temp.getSubimage(114, 12, 6, 12); // G

			redText[23] = temp.getSubimage(0, 24, 6, 12); // H
			redText[24] = temp.getSubimage(6, 24, 6, 12); // I
			redText[25] = temp.getSubimage(12, 24, 6, 12); // J
			redText[26] = temp.getSubimage(18, 24, 6, 12); // K
			redText[27] = temp.getSubimage(24, 24, 6, 12); // L
			redText[28] = temp.getSubimage(30, 24, 6, 12); // M
			redText[29] = temp.getSubimage(36, 24, 6, 12); // N
			redText[30] = temp.getSubimage(42, 24, 6, 12); // O
			redText[31] = temp.getSubimage(48, 24, 6, 12); // P
			redText[32] = temp.getSubimage(54, 24, 6, 12); // Q
			redText[33] = temp.getSubimage(60, 24, 6, 12); // R
			redText[34] = temp.getSubimage(66, 24, 6, 12); // S
			redText[35] = temp.getSubimage(72, 24, 6, 12); // T
			redText[36] = temp.getSubimage(78, 24, 6, 12); // U
			redText[37] = temp.getSubimage(84, 24, 6, 12); // V
			redText[38] = temp.getSubimage(90, 24, 6, 12); // W
			redText[39] = temp.getSubimage(96, 24, 6, 12); // X
			redText[40] = temp.getSubimage(102, 24, 6, 12); // Y
			redText[41] = temp.getSubimage(108, 24, 6, 12); // Z
			redText[42] = temp.getSubimage(114, 24, 6, 12); // Male

			redText[43] = temp.getSubimage(6, 36, 6, 12); // Female
			redText[44] = temp.getSubimage(18, 36, 6, 12); // ...
			redText[45] = temp.getSubimage(30, 36, 6, 12); // a
			redText[46] = temp.getSubimage(36, 36, 6, 12); // b
			redText[47] = temp.getSubimage(42, 36, 6, 12); // c
			redText[48] = temp.getSubimage(48, 36, 6, 12); // d
			redText[49] = temp.getSubimage(54, 36, 6, 12); // e
			redText[50] = temp.getSubimage(60, 36, 6, 12); // f
			redText[51] = temp.getSubimage(66, 36, 6, 12); // g
			redText[52] = temp.getSubimage(72, 36, 6, 12); // h
			redText[53] = temp.getSubimage(78, 36, 6, 12); // i
			redText[54] = temp.getSubimage(84, 36, 6, 12); // j
			redText[55] = temp.getSubimage(90, 36, 6, 12); // k
			redText[56] = temp.getSubimage(96, 36, 6, 12); // l
			redText[57] = temp.getSubimage(102, 36, 6, 12); // m
			redText[58] = temp.getSubimage(108, 36, 6, 12); // n
			redText[59] = temp.getSubimage(114, 36, 6, 12); // o

			redText[60] = temp.getSubimage(0, 48, 6, 12); // p
			redText[61] = temp.getSubimage(6, 48, 6, 12); // q
			redText[62] = temp.getSubimage(12, 48, 6, 12); // r
			redText[63] = temp.getSubimage(18, 48, 6, 12); // s
			redText[64] = temp.getSubimage(24, 48, 6, 12); // t
			redText[65] = temp.getSubimage(30, 48, 6, 12); // u
			redText[66] = temp.getSubimage(36, 48, 6, 12); // v
			redText[67] = temp.getSubimage(42, 48, 6, 12); // w
			redText[68] = temp.getSubimage(48, 48, 6, 12); // x
			redText[69] = temp.getSubimage(54, 48, 6, 12); // y
			redText[70] = temp.getSubimage(60, 48, 6, 12); // z
			redText[71] = temp.getSubimage(24, 0, 6, 12); // " "

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int charToVar(char character) {

		int temp = 71;

		if (character == '!') {
			temp = 0;
		} else if (character == ',') {
			temp = 1;
		} else if (character == '-') {
			temp = 2;
		} else if (character == '.') {
			temp = 3;
		} else if (character == '/') {
			temp = 4;
		} else if (character == '0') {
			temp = 5;
		} else if (character == '1') {
			temp = 6;
		} else if (character == '2') {
			temp = 7;
		} else if (character == '3') {
			temp = 8;
		} else if (character == '4') {
			temp = 9;
		} else if (character == '5') {
			temp = 10;
		} else if (character == '6') {
			temp = 11;
		} else if (character == '7') {
			temp = 12;
		} else if (character == '8') {
			temp = 13;
		} else if (character == '9') {
			temp = 14;
		} else if (character == '?') {
			temp = 15;
		} else if (character == 'A') {
			temp = 16;
		} else if (character == 'B') {
			temp = 17;
		} else if (character == 'C') {
			temp = 18;
		} else if (character == 'D') {
			temp = 19;
		} else if (character == 'E') {
			temp = 20;
		} else if (character == 'F') {
			temp = 21;
		} else if (character == 'G') {
			temp = 22;
		} else if (character == 'H') {
			temp = 23;
		} else if (character == 'I') {
			temp = 24;
		} else if (character == 'J') {
			temp = 25;
		} else if (character == 'K') {
			temp = 26;
		} else if (character == 'L') {
			temp = 27;
		} else if (character == 'M') {
			temp = 28;
		} else if (character == 'N') {
			temp = 29;
		} else if (character == 'O') {
			temp = 30;
		} else if (character == 'P') {
			temp = 31;
		} else if (character == 'Q') {
			temp = 32;
		} else if (character == 'R') {
			temp = 33;
		} else if (character == 'S') {
			temp = 34;
		} else if (character == 'T') {
			temp = 35;
		} else if (character == 'U') {
			temp = 36;
		} else if (character == 'V') {
			temp = 37;
		} else if (character == 'W') {
			temp = 38;
		} else if (character == 'X') {
			temp = 39;
		} else if (character == 'Y') {
			temp = 40;
		} else if (character == 'Z') {
			temp = 41;
		} else if (character == '<') {
			temp = 42;
		} else if (character == '>') {
			temp = 43;
		} else if (character == ':') {
			temp = 44;
		} else if (character == 'a') {
			temp = 45;
		} else if (character == 'b') {
			temp = 46;
		} else if (character == 'c') {
			temp = 47;
		} else if (character == 'd') {
			temp = 48;
		} else if (character == 'e') {
			temp = 49;
		} else if (character == 'f') {
			temp = 50;
		} else if (character == 'g') {
			temp = 51;
		} else if (character == 'h') {
			temp = 52;
		} else if (character == 'i') {
			temp = 53;
		} else if (character == 'j') {
			temp = 54;
		} else if (character == 'k') {
			temp = 55;
		} else if (character == 'l') {
			temp = 56;
		} else if (character == 'm') {
			temp = 57;
		} else if (character == 'n') {
			temp = 58;
		} else if (character == 'o') {
			temp = 59;
		} else if (character == 'p') {
			temp = 60;
		} else if (character == 'q') {
			temp = 61;
		} else if (character == 'r') {
			temp = 62;
		} else if (character == 's') {
			temp = 63;
		} else if (character == 't') {
			temp = 64;
		} else if (character == 'u') {
			temp = 65;
		} else if (character == 'v') {
			temp = 66;
		} else if (character == 'w') {
			temp = 67;
		} else if (character == 'x') {
			temp = 68;
		} else if (character == 'y') {
			temp = 69;
		} else if (character == 'z') {
			temp = 70;
		}

		return temp;

	}

	public static BufferedImage[] getLevelImage(int level, int type) {

		String tempS = Integer.toString(level);
		BufferedImage[] temp = new BufferedImage[tempS.length()];

		if (type == 1) {
			temp = getBattleTranslation(tempS);
		} else if (type == 2) {
			temp = getDarkTranslation(tempS);
		} else if (type == 3) {
			temp = getLightTranslation(tempS);
		} else if (type == 4) {
			temp = getPokemonSelectTranslation(tempS);
		} else if (type == 5) {
			temp = getBlueTranslation(tempS);
		} else if (type == 6) {
			temp = getRedTranslation(tempS);
		}

		return temp;

	}

	public static BufferedImage getSingleImage(char string) {

		BufferedImage image = battleText[charToVar(string)];

		return image;

	}

	public static BufferedImage[] getBattleTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = battleText[charToVar(tempC[i])];
		}

		return temp;

	}

	public static BufferedImage[] getDarkTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = darkText[charToVar(tempC[i])];
		}

		return temp;

	}

	public static BufferedImage[] getBlueTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = blueText[charToVar(tempC[i])];
		}

		return temp;

	}

	public static BufferedImage[] getRedTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = redText[charToVar(tempC[i])];
		}

		return temp;

	}

	public static BufferedImage[] getLightTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = lightText[charToVar(tempC[i])];
		}

		return temp;

	}

	public static BufferedImage[] getPokemonSelectTranslation(String string) {

		char[] tempC = new char[string.length()];
		tempC = string.toCharArray();

		BufferedImage[] temp = new BufferedImage[tempC.length];

		for (int i = 0; i < tempC.length; i++) {
			temp[i] = pokemonSelectText[charToVar(tempC[i])];
		}

		return temp;

	}

}
