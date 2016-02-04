package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by ramon on 04-02-16.
 */
public class JavaComparator {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[]=new Player[N];
        Checker check=new Checker();
        for(int i=0;i<N;i++)
        {
            s=br.readLine().trim();
            st=new StringTokenizer(s);
            Player[i]=new Player();
            Player[i].name=st.nextToken();
            Player[i].score=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player,check.desc);
        for(int i=0;i<Player.length;i++)
        {
            System.out.printf("%s %s\n",Player[i].name,Player[i].score);
        }


    }
}
class Checker{
    Comparator<Player> desc = new Comparator<Player>() {
        @Override
        public int compare(Player p1, Player p2) {
            if(p1.score!=p2.score){
               return Integer.compare(p2.score,p1.score);
            }else{
                return p2.name.compareTo(p1.name);
            }
        }
    };

}

class Player
{
    String name;
    int score;
}