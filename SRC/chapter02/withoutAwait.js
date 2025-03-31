fetch('https://jsonplaceholder.typicode.com/users')

//받아온 객체를 json형태로 변환
  .then((response) => response.jason())
  .then((data) => console.log(data))
  .catch((err) => console.log(err));
