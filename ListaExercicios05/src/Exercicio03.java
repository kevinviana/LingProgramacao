
public class Exercicio03 {

	public static void main(String[] args) {
        int m[][] = new int[5][5];
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				m[i][j] = (int)(Math.random()*100);
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		
		int v[] = new int[m.length*m.length];
		for(int i=0;i<v.length;i++)
			v[i] = Integer.MIN_VALUE;
		
		System.out.println();
		
		int k=0;
		
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				boolean jaexiste = false;
				
				for (int z=0;z<v.length;z++) {
					if (v[z] == m[i][j]) {
						jaexiste = true;
						break;
					}
				}
				
				if (jaexiste == false) {
					v[k] = m[i][j];
					k++;
				}
			}
		}
		
		for(int z=0;z<v.length;z++) {
			int conta = 0;
			
			for(int i=0;i<=m.length-1;i++) {
				for(int j=0;j<=m[i].length-1;j++) {
					if (v[z] == m[i][j])
						conta++;
				}
			}
			
			if (conta > 1) {
				System.out.println(v[z] + " - " + conta + " vezes");
			}
			
		}
		
		

	}

}
