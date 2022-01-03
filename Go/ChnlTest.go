package main

import (
	"fmt"
	"time"
)

func main() {

	cnl := make(chan int)




        go func() {
	cnl <-  256

}()

time.Sleep(time.Second*2)

m := <- cnl

fmt.Println(m)



}
