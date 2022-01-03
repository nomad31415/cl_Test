package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
)

func main() {

	type Mystruct []struct {
		GlobalID       int    `json:"global_id"`
		SystemObjectID string `json:"system_object_id"`
		SignatureDate  string `json:"signature_date"`
		Razdel         string `json:"Razdel"`
		Kod            string `json:"Kod,omitempty"`
		Name           string `json:"Name"`
		Idx            string `json:"Idx"`
		Nomdescr       string `json:"Nomdescr,omitempty"`
	}

	var sm uint64

	data, err := ioutil.ReadFile("data-20190514T0100.json")

	if err != nil {
		fmt.Println(err)
		return
	}

	//u := &Mystruct{}
	var u Mystruct
	json.Unmarshal(data, &u)


	//fmt.Printf("struct:\n\t%#v\n\n", u.Idx)


        for idx, _:= range u {
		 // fmt.Println(u[idx].GlobalID )
		 sm += uint64(u[idx].GlobalID)
	  }



//	for _, p := range u {
//		sm += p.global_id
//	}

	fmt.Println(sm)

}
