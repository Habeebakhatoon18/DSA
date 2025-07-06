public class Pattern {
  
 public static void print4(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 1; var2 <= var1; ++var2) {
            System.out.print(var1);
         }

         System.out.println();
      }

   }

   public static void print5(int var0) {
      for(int var1 = var0; var1 > 0; --var1) {
         for(int var2 = 0; var2 < var1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void print6(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 1; var2 <= var0 - var1 + 1; ++var2) {
            System.out.print(var2);
         }

         System.out.println();
      }

   }

   public static void print7(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         int var2;
         for(var2 = 0; var2 < var0 - var1; ++var2) {
            System.out.print(" ");
         }

         for(var2 = 1; var2 <= 2 * var1 - 1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void print8(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         int var2;
         for(var2 = 1; var2 < var1; ++var2) {
            System.out.print(" ");
         }

         for(var2 = 1; var2 <= 2 * var0 - (2 * var1 - 1); ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void print9(int var0) {
      print7(var0);
      print8(var0);
   }

   public static void print10(int var0) {
      for(int var1 = 1; var1 <= 2 * var0 - 1; ++var1) {
         int var2;
         if (var1 <= var0) {
            for(var2 = 1; var2 <= var1; ++var2) {
               System.out.print("*");
            }
         } else {
            for(var2 = 1; var2 <= 2 * var0 - var1; ++var2) {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }

   public static void print11(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         if (var2 % 2 == 0) {
            var1 = 1;
         }

         for(int var3 = 0; var3 <= var2; ++var3) {
            System.out.print(var1);
            var1 = 1 - var1;
         }

         System.out.println();
      }

   }

   public static void print12(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         int var2;
         for(var2 = 1; var2 <= var1; ++var2) {
            System.out.print(var2);
         }

         for(var2 = 0; var2 <= 2 * (var0 - var1); ++var2) {
            System.out.print(" ");
         }

         for(var2 = var1; var2 >= 1; --var2) {
            System.out.print(var2);
         }

         System.out.println();
      }

   }

   public static void print13(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         for(int var3 = 0; var3 <= var2; ++var3) {
            int var10001 = var1++;
            System.out.print("" + var10001 + " ");
         }

         System.out.println();
      }

   }

   public static void print14(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         int var2 = 65;

         for(int var3 = 0; var3 <= var1; ++var3) {
            int var10001 = var2++;
            System.out.print((char)var10001 + " ");
         }

         System.out.println();
      }

   }

   public static void print15(int var0) {
      for(int var1 = var0; var1 >= 1; --var1) {
         int var2 = 65;

         for(int var3 = 0; var3 < var1; ++var3) {
            int var10001 = var2++;
            System.out.print((char)var10001 + " ");
         }

         System.out.println();
      }

   }

   public static void print16(int var0) {
      int var1 = 65;

      for(int var2 = 0; var2 < var0; ++var2) {
         for(int var3 = 0; var3 <= var2; ++var3) {
            System.out.print((char)var1 + " ");
         }

         ++var1;
         System.out.println();
      }

   }

   public static void print17(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         int var2 = 65;

         int var3;
         for(var3 = 0; var3 < var0 - var1 - 1; ++var3) {
            System.out.print("  ");
         }

         for(var3 = 0; var3 < 2 * var1 + 1; ++var3) {
            int var10001;
            if (var3 >= var1) {
               var10001 = var2--;
               System.out.print((char)var10001 + " ");
            } else {
               var10001 = var2++;
               System.out.print((char)var10001 + " ");
            }
         }

         System.out.println();
      }

   }

   public static void print18(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         int var2 = 64 + (var0 - var1);

         for(int var3 = 0; var3 <= var1; ++var3) {
            System.out.print((char)(var2++));
         }

         System.out.println();
      }

   }

   public static void print19(int var0) {
      for(int var1 = 1; var1 <= 2 * var0; ++var1) {
         int var2 = var1 <= var0 ? var0 - var1 + 1 : var1 - var0;
         int var3 = var0 - var2;

         int var4;
         for(var4 = 0; var4 < var2; ++var4) {
            System.out.print("*");
         }

         for(var4 = 0; var4 < 2 * var3; ++var4) {
            System.out.print(" ");
         }

         for(var4 = 0; var4 < var2; ++var4) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void print20(int var0) {
      for(int var1 = 1; var1 < 2 * var0; ++var1) {
         int var2 = var1 <= var0 ? var1 : 2 * var0 - var1;
         int var3 = var0 - var2;

         int var4;
         for(var4 = 0; var4 < var2; ++var4) {
            System.out.print("*");
         }

         for(var4 = 0; var4 < 2 * var3; ++var4) {
            System.out.print(" ");
         }

         for(var4 = 0; var4 < var2; ++var4) {
            System.out.print("*");
         }

         System.out.println();
      }

   }

   public static void print21(int var0) {
      for(int var1 = 0; var1 < var0; ++var1) {
         for(int var2 = 0; var2 < var0; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 != var0 - 1 && var2 != var0 - 1) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }

         System.out.println();
      }

   }

   public static void print22(int var0) {
      for(int var1 = 0; var1 < 2 * var0 - 1; ++var1) {
         int var2 = var1;
         int var3 = 2 * var0 - 2 - var1;

         for(int var4 = 0; var4 < 2 * var0 - 1; ++var4) {
            int var6 = 2 * var0 - 2 - var4;
            int var7 = Math.min(Math.min(var4, var6), Math.min(var2, var3));
            System.out.print(var0 - var7);
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      print22(4);
   }
}
 
