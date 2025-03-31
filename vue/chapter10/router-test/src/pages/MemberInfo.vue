<template>
  <div class="card card-body"></div>
  <h2>Member Info</h2>
  <div className="mt-5">
    <img :src="member.photo" class="img" alt="" />
    <h4 class="mt-2">{{ member.name }}({{ member.role }})</h4>
    <p>{{ member.desc }}</p>
    <!-- 인스타 정보가 있는 경우에만 링크 생성 -->
    <a
      :href="member.insta"
      v-if="member.insta && member.insta !== ''"
      class="fa fa-instagram m-1"
    ></a>
    <a
      :href="member.facebook"
      v-if="member.facebook && member.facebook !== ''"
      class="fa fa-facebook m-1"
    ></a>
    <a
      :href="member.youtube"
      v-if="member.youtube && member.youtube !== ''"
      class="fa fa-youtube m-1"
    ></a>
    <br />
    <router-link :to="{ name: 'members' }">멤버 목록으로</router-link>
  </div>
</template>
<script>
import { useRoute } from 'vue-router';
import members from '@/members.json';

export default {
  name: 'MemberInfo',
  setup() {
    const currentRoute = useRoute();
    // 경로내의 데이터는 묹열이기 때문에 파싱 필요
    const id = parseInt(currentRoute.params.id, 10);
    // 경로에 있는 아이디와 일치하는 데이터를 json에서 찾는다
    const member = members.find((m) => m.id === id);

    return { currentRoute };
  },
};
</script>
