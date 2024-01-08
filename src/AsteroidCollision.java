import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class AsteroidCollision {

    /*
    We are given an array asteroids of integers representing asteroids in a row.

    For each asteroid, the absolute value represents its size, and the sign represents its direction
    (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

    Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
    If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

    Input: asteroids = [5,10,-5]
    Output: [5,10]
    Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

    */

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (int x : asteroids) {
            if (x > 0) {
                stk.offerLast(x);
            } else {
                while (!stk.isEmpty() && stk.peekLast() > 0 && stk.peekLast() < -x) {
                    stk.pollLast();
                }
                if (!stk.isEmpty() && stk.peekLast() == -x) {
                    stk.pollLast();
                } else if (stk.isEmpty() || stk.peekLast() < 0) {
                    stk.offerLast(x);
                }
            }
        }
        int[] res = new int[stk.size()];
        int i = 0;
        while(!stk.isEmpty()) {
            res[i++] = stk.pollFirst();
        }
        return res;
    }



    /*public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> ast = new ArrayDeque<>();

        for(int i=0;i<asteroids.length;i++){
            if(ast.isEmpty()||asteroids[i]>0) {
                ast.offerLast(asteroids[i]);
            }else{
                while(true){
                    int peek=ast.peekLast();
                    if(peek<0){ // [-5,-4] -3
                        ast.offerLast(asteroids[i]);
                        break;
                    }else if(peek==-asteroids[i]){ // [-5,-4] -4
                        ast.pollLast();
                        break;
                    }else if(peek>-asteroids[i]){ // [5,4] -3
                        break;
                    }else{
                        ast.pollLast();
                        if(ast.isEmpty()){
                            ast.offerLast(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] res = new int[ast.size()];
        int i = 0;
        while(!ast.isEmpty()) {
            res[i++] = ast.pollFirst();
        }
        return res;
    }*/

    /*public static int[] asteroidCollision(int[] asteroids) {//-2,-2,1,-2
        Stack<Integer> ast = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(ast.empty()||asteroids[i]>0) {
                ast.push(asteroids[i]);
            }else{
                while(true){
                    int peek=ast.peek();
                    if(peek<0){
                        ast.push(asteroids[i]); // [-5,-4] -3
                        break;
                    }else if(peek==-asteroids[i]){ // [-5,-4] -4
                        ast.pop();
                        break;
                    }else if(peek>-asteroids[i]){ // [5,4] -3
                        break;
                    }else{
                        ast.pop();
                        if(ast.isEmpty()){
                            ast.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        return ast.stream().mapToInt(i->i).toArray();
    }*/

    public static void main(String[] args) {
        int[] arr = {-2,-2,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

}
