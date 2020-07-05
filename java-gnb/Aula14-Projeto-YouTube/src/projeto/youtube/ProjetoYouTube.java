package projeto.youtube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Revegnge");
        v[1] = new Video("La Casa de Papel");
        v[2] = new Video("Marcella");
        
        Gafalhoto g[] = new Gafalhoto[2];
        g[0] = new Gafalhoto("macris", "Macris", 30, "F");
        g[1] = new Gafalhoto("gabi", "Gabi", 25, "F");

        /*
        System.out.println("VIDEOS===================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("GAFANHOTOS===============");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
        
        Visualizacao vis[] = new Visualizacao [5];
        vis[0] = new Visualizacao(g[0], v[0]); //macris assiste v{1}
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]); //macris assiste v[2]
        vis[1].avaliar(0.0f);
        System.out.println(vis[1].toString());
        vis[2] = new Visualizacao(g[1], v[2]); //gabi assiste v[2]
        vis[2].avaliar(10);
        System.out.println(vis[2].toString()); 
    }
    
}
