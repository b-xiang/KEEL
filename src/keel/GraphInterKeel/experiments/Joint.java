/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package keel.GraphInterKeel.experiments;

import java.util.Vector;


/**
 *
 * @author tua
 */


public class Joint {
    
    public Node before;
    public Vector<String> data_selected= new Vector<String>();
    public String type_lqd;
    public Vector<String> problem = new Vector<String>();
    public Vector<Integer> times = new Vector<Integer>();
    public Vector<Vector<String>> tableVector= new Vector<Vector<String>>(); 
    public Vector<DinamicParameter> parameters = new Vector<DinamicParameter>();
    
    
    
    
     public Joint() {
         before= null;
    }
     
     public void information()
     {
         for(int i=0;i<data_selected.size();i++)
         {
             System.out.println("IMPORTANTEEEEEEEEEEEE Dataset: "+ data_selected.get(i).toString());
             System.out.println("Porblem: "+ problem.get(i).toString());
             for(int j=0;j<parameters.get(i).size();j++)
             {
                 System.out.println("Parameter "+ j);
                 for(int v=0;v<parameters.get(i).get(j).size();v++)
                    System.out.println("Values: "+ parameters.get(i).get(j).get(v));    
             }
             
             if(times.size()!=0)
                System.out.println("times "+times.get(i));
         }
     }
     
     public boolean contain(String name)
     {
         for(int i=0;i<data_selected.size();i++)
           if(data_selected.get(i).compareTo(name)==0)
               return true;
         
         return false;
     }
     public int position_name(String name)
     {
         for(int i=0;i<data_selected.size();i++)
           if(data_selected.get(i).compareTo(name)==0)
               return i;
         
         return -1;
     }
     public void setNode(Node n)
     {
         before=n;
     }
     public Node getNode()
     {
         return before;
     }
      public String gettypelqd()
     {
         return type_lqd;
     }
     public Vector<String> getdataSelected()
     {
         for(int i=0;i<data_selected.size();i++)
             System.out.println (" Data selected: "+data_selected.get(i));
             
             return data_selected;
     }
      public Vector<String> getproblem()
     {
             return problem;
     }
      public Vector<Vector<String>> gettableVector()
     {
             return tableVector;
     }
       public Vector<DinamicParameter> getparameters()
     {
             return parameters;
     }
      public Vector<Integer> gettimes()
     {
             return times;
     }
     public void insertParameter(DinamicParameter contain )
     {
         parameters.addElement(contain);
     }
    public void insertDataSelected(String contain )
     {
         data_selected.addElement(contain);
     }
     public void insertproblem(String contain )
     {
         problem.addElement(contain);
     }
    public void removeParameters(int position)
    {
        parameters.remove(position);
    }
     public void removeDataset(int position)
    {
        data_selected.remove(position);
    }
      public void removeProblem(int position)
    {
        problem.remove(position);
    }
     public DinamicParameter getParametersP(int position)
     {
         return parameters.get(position);
     }
      
}