package tetrominos;
import model.POSITION;
import model.TETROMINO;
import view.COLOR;

public class Z_TETROMINO extends TETROMINO
{
    public Z_TETROMINO()
    {
        super();
        this.ColorUp(new COLOR(8));
    }

    @Override
    public void SetSteine()
    {
        super.steine[0] = new POSITION(0,0);
        super.steine[1] = new POSITION(-1,0);
        super.steine[2] = new POSITION(+1,-1);
        super.steine[3] = new POSITION(0,-1);
    }
}
