class AverageMark {
    public static void main(String[] args)
    {
        float  sum =0;
        float stuMark[]={50.5f,64.3f,79.8f,82.0f,56.5f};

        for (int i=0; i<=4;i++)
        {
            sum = sum + stuMark[i];
        }
        float average = sum/5;
        System.out.println("the average of student mark is"+average);
    }
    
}

                                                           