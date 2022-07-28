const fs = require('fs')

fs.readFile('hello.txt', 'utf8' , (err, data) => {
  if (err) {
    console.error(err)
    return
  }
  console.log(data.toString());
})
console.log("After file read");
