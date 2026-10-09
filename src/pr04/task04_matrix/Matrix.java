import java.util.Arrays;
public class Matrix {
    private final int[][] data;
    public Matrix(int[][] source){
        if(source==null||source.length==0) throw new IllegalArgumentException("Матрица не должна быть пустой.");
        int cols=source[0].length;
        for(int[] row:source) if(row.length!=cols) throw new IllegalArgumentException("Матрица должна быть прямоугольной.");
        data=new int[source.length][cols]; for(int i=0;i<source.length;i++) data[i]=source[i].clone();
    }
    public Matrix add(Matrix other){
        if(data.length!=other.data.length||data[0].length!=other.data[0].length) throw new IllegalArgumentException("Размеры не совпадают.");
        int[][] r=new int[data.length][data[0].length];
        for(int i=0;i<r.length;i++)for(int j=0;j<r[i].length;j++)r[i][j]=data[i][j]+other.data[i][j];
        return new Matrix(r);
    }
    public Matrix multiply(int scalar){int[][] r=new int[data.length][data[0].length];for(int i=0;i<r.length;i++)for(int j=0;j<r[i].length;j++)r[i][j]=data[i][j]*scalar;return new Matrix(r);}
    public void print(){for(int[] row:data)System.out.println(Arrays.toString(row));}
}
