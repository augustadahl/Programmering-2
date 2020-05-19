const express = require('express')
const app = express()
const port = 3000

var clientDir = __dirname + '\\client\\'

app.get('/', (req, res) => {
  res.sendFile(clientDir + 'css3_inlämning.html')
})
app.get('/shit', (req, res) => {
  res.sendFile(clientDir + 'css3_inlämning.css')
})

app.listen(port, () => console.log(`Example app listening on port port!`))