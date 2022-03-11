const fs = require('fs')

try {
  const data = fs.readFileSync('hello.txt', 'utf8')
  console.log("Data read ",data.toString())
} catch (err) {
  console.error(err)
}
