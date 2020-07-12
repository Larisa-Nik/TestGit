package OOP;

class Ball {
    double radius;
    String color;
}

class Box {
    double height;
    Ball ball;
    double radius(){
        return ball.radius;
    }
    double volume(){
        return height*height;
    }

}

public class BallBox {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.color = "Red";
        ball.radius = 1.0;

        System.out.println(ball.color);
        System.out.println(ball.radius);
        Ball blueBall=new Ball();
        blueBall.color = "blue";
        blueBall.radius = 2.0;
        System.out.println(blueBall.color);
        System.out.println(blueBall.radius);

        Box box=new Box();
        box.ball=blueBall;
        box.height=3;

        System.out.println(box.ball.color);
        box.ball=ball;
        System.out.println(box.ball.color);
        System.out.println(box.radius());
        System.out.println(box.volume());
    }

}