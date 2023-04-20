package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Materials {
	LEATHER, SUEDE, PLASTIC;

	private static Random r = new Random();

    public static Materials randomMaterials()  {

    	ArrayList<Materials> mat = new ArrayList<Materials>(Arrays.asList(Materials.values()));
        return mat.get(r.nextInt(mat.size()));
    }
    
}
