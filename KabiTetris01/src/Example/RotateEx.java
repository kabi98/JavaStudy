package Example;

public class RotateEx {
	public static void main(String[] args) {
		int[][] map = new int[2][3];

		int p = 1;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = p++;
			}
		}

		for (int d = 0; d < 4; d++) {
			print(map);
			map = rotate(map);
		}
	}

	private static int[][] rotate(int[][] m) {
		int N = m.length;
		int M = m[0].length;
		// 돌린 크기만큼으로 생성해준다.
		int[][] copyMap = new int[M][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copyMap[j][N - 1 - i] = m[i][j];
			}
		}

		// 새로 돌린 배열로 반환해준다.
		return copyMap;
	}

	private static void print(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

