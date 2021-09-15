package b_0914;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Ex5_MemberList {
   private static Ex5_MemberList model;

   private Ex5_MemberList() {
   }

   public synchronized static Ex5_MemberList getInstance() {
      if (model == null) {
         model = new Ex5_MemberList();
      }
      return model;
   }

   private final String PATH = "D:\\kosmo91\\JSP\\workspace\\jsp_0914\\src\\jsp_0914\\pets.txt";

   public void addMember(B_MemberDTO member) {
      PrintWriter out = null;
      StringBuilder sb = null;
      try {
         out = new PrintWriter(new FileWriter(PATH, true), true);
         sb = new StringBuilder();
         sb.append(member.getName()).append(":").append(member.getAddress()).append(":");
         for (String str : member.getPets()) {
            sb.append(str).append("/");
         }
         out.println(sb.toString());
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         out.close();

      }

   }

   public ArrayList<B_MemberDTO> getPetListFile() {
      ArrayList<B_MemberDTO> aryListMember = new ArrayList<>();
      BufferedReader br = null;
      String line = null;
      String[] aryTmp;
      try {
         br = new BufferedReader(new FileReader(new File(PATH)));
         try {
            while ((line = br.readLine()) != null) {
            	B_MemberDTO member = new B_MemberDTO();
               member.setName(line.split(":")[0]);
               member.setAddress(line.split(":")[1]);
               aryTmp = line.split(":")[2].split("/");
               member.setPets(aryTmp);
               aryListMember.add(member);
            }
            System.out.println(br);
         } catch (IOException e) {
            e.printStackTrace();
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } finally {
         try {
            br.close();
         } catch (IOException e) {
            e.printStackTrace();
         }

      }

      return aryListMember;
   }
}
