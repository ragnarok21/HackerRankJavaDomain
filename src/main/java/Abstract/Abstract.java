package Abstract;

import java.util.Scanner;

/**
 * Created by ramon on 12-01-16.
 */
public class Abstract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
    }
}

