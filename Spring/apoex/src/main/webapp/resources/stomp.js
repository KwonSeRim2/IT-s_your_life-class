//Stompjs.Client 객체 성생
const stompClient = new Stompjs.Client({
    brokerURL: 'ws://localhost:8080/chat-app'
});

//웹소켓 에러 발생 콜백
stompClient.onWebSocketError = (error) => {
    console.error('Error whith websocket', error)
};

//Stomp 에러 발생시 콜백
stompClient.onStompError = (frame) => {
    console.error('Broker repoted error: '+frame.headers['message']);
    console.error('Additional details: '+frame.body);
};

//연결 성공시 콜백
//구독 토빅 등록
stompClient.onConnect = (frame) =>{
    console.log(frame)
    setConnected(true);
    //구동ㄱ 토빅등록 및 수신 처리 핸들러 등록
    //토빅 문자열: '/topic/greetings' - 입장 메시지
    stompClient.subscribe('/topic/greetings', (greeting)=>{
        console.log('/topic/greetings', greeting.body)
        showMessage(JSON.parse(greeting.body).name + '님이 입장했습니다.');
    });

    //토픽 문자열: '/topic/chat' - chat 메시지
    stompClient.subscribe('/topic/chat', (chat) => {
        console.log('/topic/chat', chat.body)
        const message = JSON.parse(chat.body);
        showMessage(`${message.name}:${message.content}`);
    });

    //연결 성공 입장 메시지
    const name = document.getElementById('name').value;
    stompClient.publish({
        destination: '/app/hello',
        body: JSON.stringify({name})
    });
};

//연결됐을 때 엘리먼트 프로퍼티 변경
function setConnected(connected){
    const connectBtn = document.getElementById('connect');
    const disconnectBtn = document.getElementById('')
}