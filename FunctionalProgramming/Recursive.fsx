let list = [1;2;3;4]
let (head :: tail) = list
printfn "%A" head
printfn "%A" tail

let rec sum lst = 
    match lst with
    | [] -> 0
    | x :: xs -> x + (sum xs)

printfn "%A " (sum list)