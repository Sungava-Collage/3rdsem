#include <stdio.h>
#include <conio.h>
#define MAX 5
void push();
void pop();
void display();
int stack[MAX];
int top=-1;
int main()
{
    int choice;
    do
    {
        printf("\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT");
        printf("\n Enter your choice\n");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
              push();
              break;
        case 2:
              pop();
              break;
        case 3:
              display();
              break;
        case 4:
              printf("Exiting..................................................................................");
              break;
        default:
              printf("Enter the valid number");

        }
        getch();
    }
    while (choice !=4);
    return 0;
}

void push()
{
       int item;
       if(top == MAX-1)
       {
              printf("\n Overflow\n");
       }
       else
       {
              printf("\n Enter a value you want to PUSH\n");
              scanf("%d",&item);
              top +=1;
              stack[top]=item;
       }
}
void pop()
{
       int item;
       if(top==-1)
       {
              printf("\n Underflow");
       }
       else
       {
              item=stack[top];
              top-=1;
              printf("\n %d item deleted from stack",item);
       }
}

void display()
{
       int i;
       if(top ==-1)
       {
              printf("\n Underflow\n");
       }
       else
       {
              printf("\n stack element are\n");
              for(i=top;i>=0;i--)
              {
                     printf("\n %d",stack[i]);
              }
       }
}
