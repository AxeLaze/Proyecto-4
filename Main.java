import java.util.ListIterator;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
////////    	VARIABLES 		/////////////
		
		int n=30, m=100; float r=0.6f;int d=4;
//		int n=100, m=300; float r=0.4f;int d=8;
//		int n=500, m=2500; float r=0.2f;int d=15;
		
		float p=0.1f;
		boolean dirigido = false, auto = false;
		float min=1.00f;
		float max=100.00f;
////////		GRAFOS			//////////////

		Grafo grafo1 = new Grafo();
		
////////		METODO			////////////////
		
		Grafo Erdos = grafo1.ErdosRenyi("ErdosRenyi"+n, n, m, dirigido, auto);
		Grafo Gilbert = grafo1.Gilbert("Gilbert"+n, n, p, dirigido, auto);
		Grafo Geo = grafo1.Geografico("Geografico"+n, n, r, dirigido, auto);
		Grafo Bara = grafo1.BarabasiAlbert("Barabasi"+n, n, d, dirigido, auto);
		
//		Erdos.CreateAristasCostos(min,max);
//		Erdos.CreateGV(true,false);	
//		Grafo EKruskalD = Erdos.Kruskal_D();
//		EKruskalD.CreateGV(true,false);
//		Grafo EKruskalI = Erdos.Kruskal_I();
//		EKruskalI.CreateGV(true,false);
//		Grafo EPrim = Erdos.Prim(3);
//		EPrim.CreateGV(true,false);

//		Gilbert.CreateAristasCostos(min,max);
//		Gilbert.CreateGV(true,false);	
//		Grafo GKruskalD = Gilbert.Kruskal_D();
//		GKruskalD.CreateGV(true,false);
//		Grafo GKruskalI = Gilbert.Kruskal_I();
//		GKruskalI.CreateGV(true,false);
//		Grafo GPrim = Gilbert.Prim(3);
//		GPrim.CreateGV(true,false);
		
//		Geo.CreateAristasCostos(min,max);
//		Geo.CreateGV(true,false);	
//		Grafo GeoKruskalD = Geo.Kruskal_D();
//		GeoKruskalD.CreateGV(true,false);
//		Grafo GeoKruskalI = Geo.Kruskal_I();
//		GeoKruskalI.CreateGV(true,false);
//		Grafo GeoPrim = Geo.Prim(3);
//		GeoPrim.CreateGV(true,false);
		
		Bara.CreateAristasCostos(min,max);
		Bara.CreateGV(true,false);	
		Grafo BaraKruskalD = Bara.Kruskal_D();
		BaraKruskalD.CreateGV(true,false);
		Grafo BaraKruskalI = Bara.Kruskal_I();
		BaraKruskalI.CreateGV(true,false);
		Grafo BaraPrim = Bara.Prim(3);
		BaraPrim.CreateGV(true,false);
		
		
	
		
		
//		Gilbert.CreateGV();
//		Geo.CreateGV();
//		Bara.CreateGV();
		
//		Grafo BFS = Erdos.CreateBFS(3);
//		Grafo DFS_I= Erdos.CreateDFS_I(3);
//		
//		
//		BFS.CreateGV();
//		DFS_I.CreateGV();
		

	}
}
