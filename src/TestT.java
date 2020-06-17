import org.junit.Test;
import static org.junit.Assert.*;
public class TestT {
    private static Point zero = new Point(0.0, 0.0, 0.0);
    private static Point p_1 = new Point(0.0, 0.0, 2.0);
    private static Point p_2 = new Point(0.0, 0.0, 1.0);
    private static Point p_3 = new Point(-0.2, 0.1, 1.0);
    private static Point p_4 = new Point(-1.2, 0.1, 1.0);
    private static Point p_5 = new Point(1.0, -1.0, 2.0);
    private static Point p_6 = new Point(1.0, -5.0, 2.0);

    @Test
    public void testSecondAreaMiss() {
        assertFalse(p_4.isInArea());
    }	
	
    @Test
    public void testThirdAreaHit() {
        assertTrue(p_5.isInArea());
    }
    @Test
    public void testFirstAreaHit() {
        assertTrue(p_1.isInArea());
    }
    @Test
    public void testFirstAreaMiss() {
        assertFalse(p_2.isInArea());
    }
    @Test
    public void testSecondAreaHit() {
        assertFalse(p_3.isInArea());
    }
    @Test
    public void testThirdAreaMiss() {
        assertFalse(p_6.isInArea());
    }
    @Test
    public void testZero() {
        assertTrue(zero.isInArea());
    }


   @Test
   public void InFirstArea1() {
       assertTrue(new Point(4.0, 0.0, 5.0).isInArea());
   }

@Test
   public void InFirstArea2() {
       assertTrue(new Point(0.0, 3.0, 5.0).isInArea());
   }


@Test
   public void InFirstArea3() {
       assertFalse(new Point(7.0, 0.0, 5.0).isInArea());
   }



   @Test
   public void notInSecondArea1() {
       assertFalse(new Point(1.0, -2.0, 2.0).isInArea());
   }

   @Test
   public void notInThirdArea1() {
       assertTrue(new Point(1.0, -2.0, 3.0).isInArea());
   }



   @Test
   public void InSecondArea4() {
       assertTrue(new Point(1.0, -2.0, 3.0).isInArea());
   }


   @Test
   public void InThirdArea5() {
       assertFalse(new Point(-4.0,0.0, 5.0).isInArea());
   }

  @Test
   public void InThirdArea6() {
       assertFalse(new Point(-4.1,0.0, 5.2).isInArea());
   }



  @Test
   public void InSecondArea7() {
       assertTrue(new Point(0.0, -5.0, 5.0).isInArea());
   }
 @Test
   public void notInSecondArea8() {
       assertFalse(new Point(2.5, -5.0, 5.0).isInArea());
   }


   @Test
   public void notInThirdArea9() {
       assertFalse(new Point(-1.0, 2.0, 3.0).isInArea());
   }

@Test
   public void InFirstArea10() {
       assertTrue(new Point(5.0, 0.0, 5.1).isInArea());
   }

@Test
   public void InFirstArea11() {
       assertFalse(new Point(1.0,1.0,1.1).isInArea());
   }
  @Test
   public void NotInThirdArea12() {
       assertFalse(new Point(-4.3,0.0, 5.0).isInArea());
   }



    @Test(expected=IllegalArgumentException.class)
    public void testExeption() {
        Point wrong = new Point(1.0, 1.0, -1.0);
    }
    @Test
    public void testCorrectConstructor() {
        Point right = new Point(1.0, 1.0, 1.0);
    }
    @Test
    public void testTricky() {
        Point tricky = new Point(1.0, 1.0, 0.0);
    }
}