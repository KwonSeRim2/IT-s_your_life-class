<template>
  <div class="container">
    <!-- <h1>improve-acting-lab</h1> -->
    <LineReadyButton @ready="handleReady">
      <div class="c">버튼 누른 횟수: {{ count }}</div>
      <br />
      <div class="mess"><i>준비되면 눌러주세요! 자신감을 가져요!</i></div>
    </LineReadyButton>
    <LineCard
      @RandomLineProvider="randomLine"
      v-if="click"
      :currentLine="currentLine"
    >
      <template #tip>
        <div>🎯TIP: 표정 풍부하게, 발음 또박또박!</div>
      </template>
      <template #image>
        <div>
          <img
            src="data:image/jpeg;base64,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"
            alt=""
          />
        </div>
      </template>
      <template v-slot:default="lineLength">
        <div v-if="currentLine.length >= 35">
          대사가 길어요! 천천히 연기해 보세요
        </div>
      </template>
    </LineCard>
  </div>
</template>

<script>
import LineReadyButton from './components/LineReadyButton.vue';
import LineCard from './components/LineCard.vue';
import { computed } from 'vue';

export default {
  name: 'App',
  components: { LineReadyButton, LineCard },

  data() {
    return {
      click: false,
      count: 0,
      currentLine: '대사가 아직 없습니다.',
    };
  },
  provide() {
    return {
      lines: [
        {
          line: '조금은 친절해도 되잖아. 다들 니들처럼 익숙한 게 아니니까.',
          source: '청춘시대',
        },
        {
          line: '너와 함께한 시간 모두 눈부셨다. 날이 좋아서 날이 좋지 않아서 날이 적당해서 모든 날이 좋았다.',
          source: '도깨비',
        },
        {
          line: '당신이 좋은 이유? 그저 그 사람이라서. 바로 너라서.',
          source: '응답하라 1997',
        },
        {
          line: '인생에서 시련 오는 거, 진짜와 가짜를 한 번씩 걸러내라고 하나님이 주신 기회가 아닌가 싶다.',
          source: '별에서 온 그대',
        },
        {
          line: '잊지 말자. 나는 어머니의 자부심이다. 모자라고 부족한 자식이 아니다.',
          source: '미생',
        },
      ],
    };
  },

  methods: {
    handleReady() {
      this.click = true;
      this.count += 1;
      console.log(`대사 준비 완료! (총 ${this.count}회 눌림)`);
    },
    randomLine(e) {
      this.currentLine = e.line;
    },
  },
};
</script>
<style scoped>
.mess {
  margin-left: 50px;
  padding: 20px;
  background-color: #f1f2f6;
  border: 1px solid #dfe4ea;
  border-radius: 14px;
  text-align: center;
}
.c {
  margin-left: 190px;
  margin-top: 20px;
}
h1 {
  margin-left: 130px;
}
</style>
