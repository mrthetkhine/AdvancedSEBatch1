package main

import (
	"errors"
	"fmt"
)

func div(a int, b int) (error, int) {
	if b == 0 {
		return errors.New("Division by zero"), 0
	} else {
		return nil, a / b
	}
}
func main() {
	err, result := div(11, 0)
	if err != nil {
		fmt.Println("Got some error ", err)
	} else {
		fmt.Println("Result ", result)
	}
}
