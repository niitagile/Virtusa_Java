package ForkJoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
 
public class CopyOfFolderProcessor extends RecursiveTask<List<String>>
{
   private static final long serialVersionUID = 1L;
   //This attribute will store the full path of the folder this task is going to process.
   private final String      path;
   //This attribute will store the name of the extension of the files this task is going to look for.
   private final String      extension;
 
   //Implement the constructor of the class to initialize its attributes
   public CopyOfFolderProcessor(String path, String extension)
   {
      this.path = path;
      this.extension = extension;
   }
 
   //Implement the compute() method. As you parameterized the RecursiveTask class with the List<String> type, 
   //this method has to return an object of that type.
   @Override
   protected List<String> compute()
   {
      //List to store the names of the files stored in the folder.
      List<String> list = new ArrayList<String>();
      //FolderProcessor tasks to store the subtasks that are going to process the subfolders stored in the folder
      List<CopyOfFolderProcessor> tasks = new ArrayList<CopyOfFolderProcessor>();
      //Get the content of the folder.
      File file = new File(path);
      File content[] = file.listFiles();
      //For each element in the folder, if there is a subfolder, create a new FolderProcessor object 
      //and execute it asynchronously using the fork() method.
      if (content != null)
      {
         for (int i = 0; i < content.length; i++)
         {
            if (content[i].isDirectory())
            {
               CopyOfFolderProcessor task = new CopyOfFolderProcessor(content[i].getAbsolutePath(), extension);
               task.fork();
               tasks.add(task);
            }
            //Otherwise, compare the extension of the file with the extension you are looking for using the checkFile() method 
            //and, if they are equal, store the full path of the file in the list of strings declared earlier.
            else
            {
               if (checkFile(content[i].getName()))
               {
                  list.add(content[i].getAbsolutePath());
               }
            }
         }
      }
     
      //add to the list of files the results returned by the subtasks launched by this task.
      addResultsFromTasks(list, tasks);
      //Return the list of strings
      return list;
   }
 
   //For each task stored in the list of tasks, call the join() method that will wait for its finalization and then will return the result of the task. 
   //Add that result to the list of strings using the addAll() method.
   private void addResultsFromTasks(List<String> list, List<CopyOfFolderProcessor> tasks)
   {
      for (CopyOfFolderProcessor item : tasks)
      {
         list.addAll(item.join());
      }
   }
 
   //This method compares if the name of a file passed as a parameter ends with the extension you are looking for.
   private boolean checkFile(String name)
   {
      return name.endsWith(extension);
   }
}