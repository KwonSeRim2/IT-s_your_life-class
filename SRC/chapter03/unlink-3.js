const fs = require('fs');

if (!fs.existsSync('./text 1.txt')) {
  console.log('없다');
} else {
  fs.unlinkSync('./text 1.txt', (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('file deleted');
  });
  console.log('삭제');
}
