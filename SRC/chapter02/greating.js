const user = '홍길동';
//인사하는 함수
const hello = (name) => {
  console.log(`${name}님 안녕하세요`);
};

module.exports = user;

module.exports = hello;


module.export.hello = (name) => {
    console.log(`${name}님 안녕하세요`);
  };

hello(user);
