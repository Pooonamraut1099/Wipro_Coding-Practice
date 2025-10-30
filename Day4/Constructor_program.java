package Day4.Practice_Quiz;

public class Constructor_program {
    public static void main(String args[])
    {
        // create boxes using the various constructors
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7); 
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

        double volume;

        // get volume of first box
        volume = shape1.volume();
        System.out.println("Volume of shape1 is " + volume);

        // get volume of second box
        volume = shape2.volume();
        System.out.println("Volume of shape2 is " + volume);

        // get volume of cube
        volume = shape3.volume();
        System.out.println("Volume of shape3 is " + volume);
    }
}

class ThreeDimensionShape
{
    double width, height, depth;

    // constructor used when all dimensions are defined 
    ThreeDimensionShape(double w, double h, double d)
    {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // constructor used when one dimension is defined (cube)
    ThreeDimensionShape(double l)
    {
        this.width = l;
        this.height = l;
        this.depth = l;
    }

    // constructor used when no dimension is specified 
    ThreeDimensionShape()
    {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    // compute and return volume 
    double volume()
    {
        return width * height * depth;
    }
}
