package pizza;
public class PovoljnijaPizza {
	public static void main(String[] args) {
		
		int r_male = 23, c_male = 170;
		int r_velike = 40, c_velike = 750;
		int r_parceta = 40, c_parceta = 150;
		
		
		double p_male = r_male * r_male * Math.PI;
		double p_velike = r_velike * r_velike * Math.PI;
		double p_parceta = r_parceta * r_parceta * Math.PI / 5;	
		
		
		double cpd_male = p_male / c_male;
		double cpd_velike = p_velike / c_velike;
		double cpd_parceta = p_parceta / c_parceta;
		
		
		System.out.printf("povrsina male:    \t %.2f \t cena: %ddin \t cm2 po dinaru: %.2fcm2 \n", p_male, c_male, cpd_male);
		System.out.printf("povrsina parèeta: \t %.2f \t cena: %ddin \t cm2 po dinaru: %.2fcm2 \n", p_parceta, c_parceta, cpd_parceta);
		
		if(cpd_parceta > cpd_male) {
			System.out.println("parèe pizza je isplativije");
		}else
			System.out.println("mala pizza je isplativija");
	}
}	

