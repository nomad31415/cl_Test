package main


import (
	"fmt"
	"bufio"
	"os"

)

func main(){

reader:= bufio.NewReader(os.Stdin)
s,_ := reader.ReadString('\n')

fmt.PrintLn(s)


}
